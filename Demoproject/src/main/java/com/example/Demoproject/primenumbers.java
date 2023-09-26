package com.example.DemoProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class primenumbers{

    @GetMapping("/PrimeNo")
    public List<Integer> prime_N(@RequestParam(defaultValue = "10") int N) {
        List<Integer> primeno = new ArrayList<>();

        for (int x = 2; x <= N; x++) {
            if (isPrime(x)) {
                primeno.add(x);
            }
        }

        return primeno;
    }

    private boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        for (int y = 2; y <= num / 2; y++) {
            if (num % y == 0) {
                return false;
            }
        }

        return true;
    }
}
