//criando variáveis
var nome = "Fernando";
let nome2 = "Fernando 2";

//Constante
const nome3 = "Fernando 3";

//demostração diferença var e let

for(var i = 0; i < 10; i++){}

//console.log(i);

for(let f = 0; f < 10; f++){} 

//console.log(f);

//demosntrando como alterar valor da constante em alguns caso específicos 
//const casa ={
//cor: cinza
//}

//console.log(casa);

let a = "a";  //String 
let a1 = 'a'; //String
let b = 1; //Number
let c = 1.00; //Number
let d = true; //Boolean
let e = {} //Object
let f = [] //Array
let g = function () {}; //Fuction

//verificando o tipo de dado
//console.log(typeof f);

//Site para visualização das especificações
//http://jsonformatter.curiousconcept.com

console.log(obter());

// fuction named
function pesquisar() {console.log("Function named;")};

//function anonymous
let consultar = function() {console.log("Function anonymous;")};

//function named expressed
let obter = function obter() {console.log("Function named expressed;")};

//function arrow function 
let filtrar = () => {console.log("Function arrow function;")};

//function constructor
function Pessoa(){
    console.log("function constructor");
    return {};
}

//Diferença entra as funções 

let carro = ["fusca", "uno","ferrari"];

//adiciona e remove de acordo com parametro
carro.splice(0,2);

//faz uma copia do array principal a partir do parametro
carro.slice(1,2);

