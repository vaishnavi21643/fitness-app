////package com.fitness.aiservice;
////
////public class DataLoader {
////}
//
//package com.fitness.aiservice;
//
//import com.fitness.aiservice.model.Recommendation;
//import com.fitness.aiservice.repository.RecommendationRepository;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import reactor.core.publisher.Mono;
//
//import java.time.LocalDateTime;
//import java.util.Arrays;
//
//@Configuration
//public class DataLoader {
//
//    @Bean
//    CommandLineRunner loadData(RecommendationRepository repo) {
//        return args -> {
//
//            Recommendation rec = Recommendation.builder()
//                    .activityId("A101")
//                    .userId("U001")
//                    .activityType("Workout")
//                    .recommendation("Increase protein intake and maintain hydration")
//                    .improvements(Arrays.asList("Improve posture", "Increase reps gradually"))
//                    .suggestions(Arrays.asList("Drink water", "Warm-up before exercise"))
//                    .safety(Arrays.asList("Avoid overtraining", "Take rest days"))
//                    .createdAt(LocalDateTime.now())
//                    .build();
//
//            repo.save(rec)
//                    .doOnSuccess(data -> System.out.println("✅ Dummy Data Inserted: " + data))
//                    .subscribe(); // VERY IMPORTANT for reactive
//        };
//    }
//}
