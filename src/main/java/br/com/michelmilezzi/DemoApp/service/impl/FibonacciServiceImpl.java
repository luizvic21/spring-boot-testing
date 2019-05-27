package br.com.michelmilezzi.DemoApp.service.impl;

import br.com.michelmilezzi.DemoApp.service.FibonacciService;
import org.springframework.stereotype.Service;

@Service
public class FibonacciServiceImpl implements FibonacciService {

    @Override
    public Long calcularFibonacci(int target) {

        Long fibo = 0L;

        for (int i = 0; i <= target; i++) {
            fibo = calcularSectionFibonacci(i);
            System.out.println(fibo);
        }

        return fibo;
    }

    private Long calcularSectionFibonacci(int target) {

        if ( target <= 1) {
            return Long.valueOf(target);
        }

        return calcularSectionFibonacci(target - 1) + calcularSectionFibonacci(target -2);
    }
}
