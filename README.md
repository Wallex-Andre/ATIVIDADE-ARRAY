# ATIVIDADE-ARRAY

Tutorial:

# Array 1:

1. Importando as Bibliotecas:

java.util.Arrays: Essa biblioteca fornece métodos para manipular arrays, como o sort() que usei para ordenar os nomes.
java.util.Scanner: Essa biblioteca permite a leitura de dados a partir do teclado.
2. Criando a Classe:

Array1: Essa é a classe principal onde nosso programa reside.
3. Lendo os Nomes:

Scanner scanner = new Scanner(System.in);: Cria um objeto Scanner para ler a entrada do usuário.
String[] nomes = new String[10];: Declara um array de strings chamado nomes com capacidade para 10 elementos.
for loop: Itera 10 vezes, solicitando ao usuário que digite um nome a cada iteração.
scanner.nextLine();: Lê a próxima linha digitada pelo usuário e armazena no array nomes.
4. Ordenando os Nomes:

Arrays.sort(nomes);: Chama o método sort() da classe Arrays para ordenar os elementos do array nomes em ordem alfabética.
5. Imprimindo os Nomes Ordenados:

for each loop: Itera sobre cada elemento do array nomes e imprime o nome na tela.

Explicação Passo a Passo
Imagine que você está criando uma lista de convidados para uma festa. Você quer que a lista esteja em ordem alfabética para facilitar a busca. Este código faz exatamente isso, mas com nomes em vez de convidados.

Criei uma lista vazia: Essa lista é representada pelo array nomes.
Pedimos para o usuário preencher a lista: A cada nome digitado, adicionei o nome à lista.
Organizei a lista: Usei o método sort() para colocar os nomes em ordem alfabética, como se você estivesse organizando livros em uma estante.
Mostrei a lista organizada: Imprimimos cada nome da lista, um abaixo do outro, em ordem alfabética.

# Array 2: 

O código é muito similar ao anterior, mas com uma pequena alteração na ordenação:

Importando a Classe Collections: Importei a classe Collections para acessar o método reverseOrder().
Ordenação Invertida: Ao chamar o Arrays.sort(), usei o método Collections.reverseOrder() como segundo argumento. Isso indica que queremos ordenar o array nomes em ordem inversa (descrescente).
Explicação Passo a Passo
Os passos são idênticos ao tutorial anterior, exceto pela ordenação:

Criei uma lista vazia: Armazenei os nomes em um array nomes.
Pedimos para o usuário preencher a lista: Solicitei 20 nomes do usuário e os adicionei ao array.
Organizei a lista em ordem decrescente: Usei o sort() com reverseOrder() para colocar os nomes da última letra para a primeira.
Mostrei a lista organizada: Imprimimos cada nome da lista, um abaixo do outro, em ordem decrescente.
Resumo do Código
Este programa permite que você digite 20 nomes e, em seguida, os organiza em ordem decrescente alfabeticamente. Ele demonstra como manipular a ordenação de arrays usando métodos como reverseOrder().

# Array 3: 

int[] numeros = new int[50];: Aqui, eu criei uma lista chamada numeros que pode armazenar até 50 números inteiros. Pense nela como 50 caixinhas vazias, prontas para serem preenchidas.

System.out.println("Digite 50 números:");: Essa linha mostra uma mensagem na tela, pedindo para você digitar os números.

for (int i = 0; i < numeros.length; i++) { ... }: Esse trecho de código repete as instruções dentro dele 50 vezes. A cada repetição, ele pede para você digitar um número e coloca esse número na próxima caixinha vazia da lista numeros.

Arrays.sort(numeros);: Essa linha mágica faz a parte mais importante: ela pega a lista de números que você digitou e os organiza em ordem crescente, do menor para o maior.

System.out.println("\nNúmeros em ordem crescente:");: Essa linha mostra uma mensagem na tela, dizendo que os números agora estão em ordem crescente.
for (int numero : numeros) { ... }: Esse trecho de código percorre a lista de números já ordenada e mostra cada número na tela, um embaixo do outro.

Em resumo:

O programa pede para você digitar 50 números.
Ele armazena esses números em uma lista.
A lista é organizada do menor para o maior.
Os números ordenados são mostrados na tela.

# Array 4:

O código é muito similar ao anterior, mas com uma pequena alteração na ordenação:

Importando a Classe Collections: Importei a classe Collections para acessar o método reverseOrder().
Ordenação Invertida: Ao chamar o Arrays.sort(), usei o método Collections.reverseOrder() como segundo argumento. Isso indica que queremos ordenar o array numeros em ordem inversa (descrescente).

Arrays.sort(numeros, Collections.reverseOrder());:

# Array 5: 

int[] todosNumeros = new int[100];: Criei uma lista chamada todosNumeros que pode armazenar até 100 números inteiros. Essa lista vai guardar todos os números que você digitar.

int[] numerosPares = new int[100];: Criei outra lista chamada numerosPares também com capacidade para 100 números. Essa lista vai armazenar apenas os números pares que você digitar.

int countPares = 0;: Criei uma variável countPares para contar quantos números pares foram encontrados.

System.out.println("Digite 100 números:");: Essa linha mostra uma mensagem na tela, pedindo para você digitar os números.

for (int i = 0; i < todosNumeros.length; i++) { ... }: Esse trecho de código repete as instruções dentro dele 100 vezes. A cada repetição, ele pede para você digitar um número e o armazena na lista todosNumeros.

if (todosNumeros[i] % 2 == 0) { ... }: Esse if verifica se o número digitado é par. Se for, ele é adicionado à lista numerosPares e a variável countPares é incrementada.

int[] numerosParesFinal = new int[countPares];: Criei uma nova lista numerosParesFinal com o tamanho exato da quantidade de números pares encontrados.

System.arraycopy(numerosPares, 0, numerosParesFinal, 0, countPares);: CopiA todos os números pares da lista numerosPares para a lista numerosParesFinal. Isso é necessário porque a lista numerosPares pode ter espaços vazios no final.

System.out.println("\nNúmeros pares digitados:");: Essa linha mostra uma mensagem na tela, indicando que os números a seguir são os pares.

for (int numero : numerosParesFinal) { ... }: Esse trecho de código percorre a lista numerosParesFinal e mostra cada número par na tela.

Em resumo:

O programa pede para você digitar 100 números.
Ele armazena todos os números em uma lista.
Ele verifica cada número para ver se é par.
Os números pares são armazenados em outra lista.
A lista final com apenas os números pares é exibida na tela.

# Array 6: 


int[] todosNumeros = new int[100];: Criei uma lista chamada todosNumeros para armazenar até 100 números inteiros. Essa lista vai guardar todos os números que você digitar.

int[] numerosImpares = new int[100];: Criei outra lista chamada numerosImpares também com capacidade para 100 números. Essa lista vai armazenar apenas os números ímpares.

int countImpares = 0;: Criei uma variável para contar quantos números ímpares encontrei.

System.out.println("Digite 100 números:");: Mostrei uma mensagem na tela, pedindo para você digitar os números.

for (int i = 0; i < todosNumeros.length; i++) { ... }: Usei um loop for para repetir um bloco de código 100 vezes. A cada repetição, pedi para você digitar um número e o armazenei na lista todosNumeros.

if (todosNumeros[i] % 2 != 0) { ... }: Verifiquei se o número digitado é ímpar. Se for, adicionei ele à lista numerosImpares e incrementei o contador de ímpares.

System.out.println("\nNúmeros ímpares digitados:");: Mostrei uma mensagem na tela, indicando que os números a seguir são os ímpares.
for (int i = 0; i < countImpares; i++) { ... }: Percorri a lista numerosImpares e mostrei cada número ímpar na tela.

Em resumo:

Criei uma lista para armazenar todos os números e outra para armazenar apenas os ímpares.
O programa pede para você digitar 100 números.
Verifiquei se cada número é ímpar.
Armazenei os números ímpares em uma lista separada.
A lista final com apenas os números ímpares é exibida na tela.

# Array 7: 

class Time {: Criei uma classe chamada Time para representar cada time do campeonato. Essa classe possui três atributos: nome, pontos e vitorias.

public class Array7 {: Criei a classe principal do programa.

public static void main(String[] args) {: Esse é o ponto de entrada do meu programa.

Time[] tabela = new Time[numTimes];: Criei um array de objetos Time chamado tabela. O tamanho desse array será definido pelo usuário, representando o número total de times no campeonato.

for (int i = 0; i < numTimes; i++) { ... }: Usei um loop for para repetir um bloco de código para cada time. Dentro do loop, coletei os dados de cada time (nome, pontos e vitórias) e criei um novo objeto Time para representá-lo.

Arrays.sort(tabela, (t1, t2) -> { ... });: Usei o método sort da classe Arrays para ordenar a tabela de times. A expressão lambda dentro do sort define a lógica de comparação entre dois times. Primeiro, compara os pontos; se os pontos forem iguais, compara o número de vitórias.

System.out.println("\nTabela de classificação:");: Imprimi uma mensagem indicando que a tabela de classificação será exibida.
for (int i = 0; i < numTimes; i++) { ... }: Percorri a tabela de times e imprimi as informações de cada time em ordem de classificação.

System.out.print("\nDigite o nome do time para consultar a posição: ");: Pedi ao usuário para digitar o nome de um time.
int posicao = encontrarPosicao(tabela, timeConsultado);: Chamei o método encontrarPosicao para determinar a posição do time na tabela.

private static int encontrarPosicao(Time[] tabela, String nome);: Criei um método para encontrar a posição de um time na tabela. Esse método percorre a tabela e compara o nome do time com o nome dos times na tabela.

Em resumo:

Criei uma classe Time para representar cada time.
Lê os dados dos times do usuário.
Armazena os dados dos times em um array.
Ordena a tabela de times com base nos pontos e vitórias.
Exibe a tabela de classificação.
Permite ao usuário consultar a posição de um time específico.
