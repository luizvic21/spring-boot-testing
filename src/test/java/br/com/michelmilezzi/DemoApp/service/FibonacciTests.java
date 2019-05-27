package br.com.michelmilezzi.DemoApp.service;

import br.com.michelmilezzi.DemoApp.service.impl.FibonacciServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class FibonacciTests {

    @Autowired
    private FibonacciServiceImpl fibonacciService;

    @Test
    public void testFibonacci() {

        Long fibo = fibonacciService.calcularFibonacci(6);

        Assertions.assertThat(fibo).isEqualTo(8);

    }
}
