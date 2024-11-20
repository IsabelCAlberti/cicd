@RestController
public class CalculadoraController {

    public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }

    @PostMapping("/divisao/{a}/{b}")
    public ResponseEntity<Double> divisao(@PathVariable double a, @PathVariable double b) {
        return ResponseEntity.ok(calculadoraService.dividir(a,b));
    }
}