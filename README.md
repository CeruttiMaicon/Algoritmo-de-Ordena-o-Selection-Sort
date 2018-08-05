# Algoritmo de Ordenação Selection Sort
Algoritmo utilizado para ordenar um vetor, e mostra o número de interações feitas por ele durante este processo de ordenação.

# Apresentação do desempenho dos algoritmos

Pegando o algoritmo e fazendo com que ele me trousesse como retorno o numero de interações feitas, ele apresenta diferentes resultados de acordo com o tamanho do vetor passado para a ordenação. Assim temos os resultados de melhor caso, pior caso e caso médio como poderemos ver no gráfico abaixo! 


![enter image description here](https://lh3.googleusercontent.com/MprZc40KoMz8YUxIURV0WNrIv-lGuNUIX8zXsBjNls394joIR1XEYIuXGQZKWEjhpGgfwsa0gagU9w "Print do resultado do algoritmo")

Todos eles utilizavam um vetor com tamanho 10 para os testes.



## Testes de desempenho
Agora fazendo os mesmos testes com vetores de 1 a 100, gerados com valores Crescentes, Decrescentes e Aleatorios, fazendo com que o algoritmo escrevece a quantidade de interações feitas com cada tipo de vetor, conseguimos retirar um gráfico no Br Office Calc e obtemos os seguintes resultados apresentados no gráfico a seguir.

![enter image description here](https://lh3.googleusercontent.com/Hi8fs6blCP0_Gv1ZFtGrS6Poqxh3IgpfVSzXcf4vvp2d1nkYPnZJJ-yDpXTvVfhlzTJML7WMGLm6Gg "Grafico de Interações do algortimo Selection Sort")

## Sobre o Trabalho

Os dados utilizados para gerar o gráfico são do retorno do algoritmo criado neste projeto. O arquivo CSV utilizado para a criação do gráfico se encontra dentro da pasta "src" com o nome de "arraySelectionSort.csv".


## Execução

No código da Classe MainCSV na linha 15, existe uma tag que deve ser mudada para gerar o arquivo CSV, ali eu especifiquei uma pasta do meu ambiente de trabalho no Ubuntu, mas deve-se trocar o local de criação do arquivo.

Após a execução do algoritmo e receber a mensagem de "Arquivo CSV criado com Sucesso!" o seu arquivo CSV é criado. E com ele eu criei o gráfico da imagem acima.