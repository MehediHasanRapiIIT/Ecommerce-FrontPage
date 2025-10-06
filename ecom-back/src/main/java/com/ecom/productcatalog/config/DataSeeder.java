package com.ecom.productcatalog.config;

import com.ecom.productcatalog.model.Category;
import com.ecom.productcatalog.model.Product;
import com.ecom.productcatalog.repository.CategoryRepository;
import com.ecom.productcatalog.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Arrays;

@Component
public class DataSeeder implements CommandLineRunner {

    private final ProductRepository productRepository;
    private final CategoryRepository categoryRepository;

    public DataSeeder(ProductRepository productRepository, CategoryRepository categoryRepository) {
        this.productRepository = productRepository;
        this.categoryRepository = categoryRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        //clear the exixting Data
        productRepository.deleteAll();
        categoryRepository.deleteAll();

        //Create Categories

        Category electronics = new Category();
        electronics.setName("Electronics");

        Category sports = new Category();
        sports.setName("Sports");

        Category clothing = new Category();
        clothing.setName("Clothing");

        Category home = new Category();
        home.setName("Home and Kitchen");

        categoryRepository.saveAll(Arrays.asList(electronics, sports, clothing, home));

        //Create Products
        Product phone = new Product();
        phone.setName("SmartPhone");
        phone.setDescription("Latest Model Smart phone with new feature");
        phone.setImageUrl("https://placehold.co/600x400");
        phone.setPrice(669.9);
        phone.setCategory(electronics);

        Product laptop = new Product();
        laptop.setName("Laptop");
        laptop.setDescription("Latest Model Laptop with new feature");
        laptop.setImageUrl("https://placehold.co/600x400");
        laptop.setPrice(899.9);
        laptop.setCategory(electronics);

        Product footBall = new Product();
        footBall.setName("Football");
        footBall.setDescription("Latest Model Football with new feature");
        footBall.setImageUrl("https://placehold.co/600x400");
        footBall.setPrice(69.9);
        footBall.setCategory(sports);

        Product shirt = new Product();
        shirt.setName("Shirt");
        shirt.setDescription("Latest Model Shirt");
        shirt.setImageUrl("https://placehold.co/600x400");
        shirt.setPrice(9.9);
        shirt.setCategory(clothing);

        Product knife = new Product();
        knife.setName("Knife");
        knife.setDescription("New Sharp knife");
        knife.setImageUrl("https://placehold.co/600x400");
        knife.setPrice(1.2);
        knife.setCategory(home);

        productRepository.saveAll(Arrays.asList(phone,laptop,footBall,shirt,knife));

    }
}
