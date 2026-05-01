//package org.example.product_management_api;
//
//import org.example.product_management_api.entity.ProductEntity;
//import org.example.product_management_api.repository.ProductRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.math.BigDecimal;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Random;
//
//@Component
//public class DataSeeder implements CommandLineRunner {
//
//    private ProductRepository productRepository;
//
//    public DataSeeder(ProductRepository productRepository) {
//        this.productRepository = productRepository;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        if (productRepository.count() > 0) {
//            return;
//        }
//        List<ProductEntity> productEntities = new ArrayList<>();
//        String[] categories = {"Electronics", "Clothing", "Food", "Books", "Sports"};
//        for (int i = 0; i < 100; i++) {
//            ProductEntity p = new ProductEntity();
//            p.setProductName("Name " + i);
//            p.setProductPrice(BigDecimal.valueOf(Math.round(Math.random() * 990 + 10)));
//            p.setDescription("Description for product " + i);
//            p.setCategory(categories[i % categories.length]);
//            p.setQuantity(new Random().nextInt(51));
//            productEntities.add(p);
//        }
//        productRepository.saveAll(productEntities);
//        System.out.println("Seeded 100 products!");
//
//    }
//}
