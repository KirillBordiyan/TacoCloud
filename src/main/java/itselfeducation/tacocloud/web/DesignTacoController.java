package itselfeducation.tacocloud.web;

import java.util.List;
import java.util.stream.Collectors;

import itselfeducation.tacocloud.data.Ingredient;
import itselfeducation.tacocloud.Taco;
import itselfeducation.tacocloud.TacoOrder;
import itselfeducation.tacocloud.data.IngredientRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import lombok.extern.slf4j.Slf4j;

import itselfeducation.tacocloud.data.Ingredient.Type;


@Slf4j
@Controller
@RequestMapping("/design")
@SessionAttributes("tacoOrder")
public class DesignTacoController {

    private final IngredientRepository ingredientRepo;

    @Autowired
    public DesignTacoController(IngredientRepository ingredientRepo){
        this.ingredientRepo = ingredientRepo;
    }
    @ModelAttribute
    public void addIngredientsToModel(Model model) {
        Iterable<Ingredient> ingredients = ingredientRepo.findAll();
        Type[] types = Ingredient.Type.values();
        for (Type type : types) {
            model.addAttribute(type.toString().toLowerCase(),
                    filterByType((List<Ingredient>) ingredients, type));
        }
    }
    @GetMapping()//using "/design" template
    public String showDesignForm() {
        return "design";
    }

    //that method will handle POST-requests with path /design
    //for check valid info, we type @Valid before param we need check + errors Errors-class,
    // than we can see errors from messages in @NotNull, @NotBlank, @Size in Taco and TacoOrder
    @PostMapping //accept taco recipe from menu in /design
    public String processTaco(@Valid Taco taco, Errors errors, @ModelAttribute TacoOrder tacoOrder){

        if (errors.hasErrors()) {
            return "design";
        }

        tacoOrder.addTaco(taco); //we added new recipe of taco in TacoOrder
        log.info("Processing taco: {}", taco);

        return "redirect:/orders/current";
    }


    @ModelAttribute(name = "tacoOrder")
    public TacoOrder order() {
        return new TacoOrder();
    }
    @ModelAttribute(name = "taco")
    public Taco taco() {
        return new Taco();
    }

    private Iterable<Ingredient> filterByType(
            List<Ingredient> ingredients, Ingredient.Type type) {
        return ingredients
                .stream()
                .filter(x -> x.getType().equals(type))
                .collect(Collectors.toList());
    }
}

