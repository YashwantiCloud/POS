package com.yc.pos.controller;

//import org.springframework.beans.factory.annotation;
//import org.springframework.stereotype.ContAutowiredroller;
//import org.springframework.web.bind.annotation.*;


//@Controller
//@RequestMapping("/categories")
public class CategoryController {

//    @Autowired
//    private CategoryService categoryService;
//
//    @GetMapping
//    public String listCategories(Model model) {
//        model.addAttribute("categories", categoryService.getAllCategories());
//        return "category-list"; // View name for listing categories
//    }
//
//    @GetMapping("/{id}")
//    public String viewCategory(@PathVariable("id") Long id, Model model) {
//        Optional<Category> category = categoryService.getCategoryById(id);
//        if (category.isPresent()) {
//            model.addAttribute("category", category.get());
//            return "category-view"; // View name for category details
//        }
//        return "error"; // Handle not found
//    }
//
//    @GetMapping("/add")
//    public String addCategoryForm(Model model) {
//        model.addAttribute("category", new Category());
//        return "category-form"; // View name for adding a new category
//    }
//
//    @PostMapping("/save")
//    public String saveCategory(@ModelAttribute("category") Category category) {
//        categoryService.saveCategory(category);
//        return "redirect:/categories"; // Redirect to list after saving
//    }
//
//    @GetMapping("/delete/{id}")
//    public String deleteCategory(@PathVariable("id") Long id) {
//        categoryService.deleteCategory(id);
//        return "redirect:/categories"; // Redirect to list after deletion
//    }
}
