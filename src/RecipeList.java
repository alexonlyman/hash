import java.util.HashSet;
import java.util.Set;

public class RecipeList {
    private Set<Recipe> recipes;

    public void add(Recipe recipe) {
        if (recipes.contains(recipe)) {
            throw new IllegalArgumentException("такой рецепт уже есть");
        }
        recipes.add(recipe);
    }

    public void remove(Recipe recipe) {
        if (!recipes.remove(recipe)) {
            throw new IllegalArgumentException("такой рецепт уже есть");
        }
    }
}
