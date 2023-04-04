package ru.neoflex.practice.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Калькулятор", description = "Позволяет проводить различные математические действия")
@RestController
public class CalcController {
    @Operation(
            summary = "Сложение",
            description = "Позволяет сложить два целых числа"
    )
    @ApiResponse(responseCode = "200", description = "Целое число")
    @GetMapping("/plus/{a}/{b}")
    public Integer onPlus(
            @PathVariable("a") @Parameter(description = "Первое число") Integer a,
            @PathVariable("b") @Parameter(description = "Второе число") Integer b
    ) {
        return a + b;
    }

    @Operation(
            summary = "Вычитание",
            description = "Позволяет вычесть разность между двумя целыми числами"
    )
    @ApiResponse(responseCode = "200", description = "Целое число")
    @GetMapping("/minus/{a}/{b}")
    public Integer onMinus(
            @PathVariable("a") @Parameter(description = "Уменьшаемое") Integer a,
            @PathVariable("b") @Parameter(description = "Вычитаемое") Integer b
    ) {
        return a - b;
    }
}
