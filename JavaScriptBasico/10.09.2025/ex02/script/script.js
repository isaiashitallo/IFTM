function main() {
    valor1 = parseFloat(prompt("Digite um valor:"));
    valor2 = parseFloat(prompt("Digite um valor:"));
    operador = prompt("Digite o operador(+, -, /, *):");
}

main();

function calculadora(valor1, valor2, operador) {
    alert(`[${valor1} ${operador} ${valor2}] = ${eval(valor1+operador+valor2)}`);
}
calculadora(valor1, valor2, operador);

// function calculadora(valor1, valor2) {
//     switch(operacao) {
//         case 1:
//             alert(valor1 + valor2);
//             break;
//         case 2:
//             valor1 - valor2;
//             break;
//         case 3:
//             valor1 * valor2;
//             break;
//         case 4:
//             valor1 / valor2;
//             break;
        
//     }    
// }
