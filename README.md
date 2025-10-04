# Felipe-y-Erick-Trabajo-de-listas---Estructura-de-datos

Nome: Erick Del Pino (aresblanq@gmail.com) y Felipe Leal (lipeal5518@gmail.com)
Construa um programa em Java que compare diferentes implementações de listas de alunos utilizando as seguintes estruturas:

ArrayList
LinkedList
Vector
Cada aluno deve ser identificado pelos seguintes atributos:

Nome (String)
Matrícula (String, com 5 números gerados aleatoriamente)
Data de Nascimento (dia/mês/ano)
Dados Pré-definidos:
Você poderá utilizar os seguintes vetores de nomes e sobrenomes para depois gerar os nomes dos alunos:

private static String[] nomes = {"Ana", "João", "Carlos", "Maria", "Pedro", "Juliana", "Lucas", "Fernanda"};
private static String[] sobrenomes = {"Silva", "Souza", "Oliveira", "Costa", "Pereira", "Rodrigues", "Almeida", "Ferreira"};
Se desejar, adicione outros nomes e sobrenomes a lista

Funcionalidades do Programa:
O programa deverá automaticamente gerar e preencher três listas de alunos, cada uma utilizando uma das implementações (ArrayList, LinkedList e Vector), e apresentar as seguintes funcionalidades:

Cadastrar Alunos:
O programa deve cadastrar 350.000 alunos nas três implementações de lista. Não é necessário exibir na tela os dados gerados.

Ordenar as Listas:
Após o cadastro, as três listas devem ser ordenadas por nome dos alunos.

Exportar Todos os Alunos para CSV:
Os dados de cada lista (já ordenada) devem ser exportados para arquivos CSV.
O arquivo CSV deve conter as colunas: Nome, Matrícula, Data de Nascimento.
Os arquivos CSV devem ser salvos com os seguintes nomes: alunos_arraylist.csv, alunos_linkedlist.csv e alunos_vector.csv.

Medição de Tempo:
O programa deve medir o tempo de execução das operações de inserção, ordenação e exportação para CSV para cada tipo de lista.
Ao final da execução, o programa deve apresentar uma tabela com os tempos de execução das três operações para as três listas (ArrayList, LinkedList e Vector).

Estrutura da Tabela de Tempo:
Operacion	ArrayList (ms)	LinkedList (ms)	Vector (ms)
Cadastro	293		138		165
Ordenacion	101		148		81
Exportacion	221		197		137

PC:

Sistema Operacional

	Windows 11 64-bit


CPU

	AMD Ryzen 7 5700G with Radeon Graphics 

	Velocidade base:	3,80 GHz
	Sockets:	1
	Núcleos:	8
	Processadores lógicos:	16
	Virtualização:	Habilitado
	Cache L1:	512 KB
	Cache L2:	4,0 MB
	Cache L3:	16,0 MB

	Utilização	2%
	Velocidade	4,01 GHz
	Tempo de atividade	9:02:05:38
	Processos	212
	Threads	3116
	Identificadores	97188


Memória

	16,0 GB

	Velocidade:	3200 MT/s
	Slots usados:	2 de 4
	Fator forma:	DIMM
	Reservada para hardware:	661 MB

	Disponível	7,4 GB
	Em cache	5,9 GB
	Confirmado	10,2/16,4 GB
	Reserva de memória paginável	486 MB
	Reserva de memória não paginável	589 MB
	Em uso (Compactada)	7,8 GB (408 MB)
  

Disco (C:)

	SSSTC CA5-8D256-Q79

	Capacidade:	239 GB
	Formatado:	239 GB
	Disco do sistema:	Sim
	Arquivo de paginação:	Sim
	Tipo:	SSD

	Velocidade de leitura	0 KB/s
	Velocidade de gravação	83,8 KB/s
	Tempo de atividade	0%
	Tempo médio de resposta	0,4 ms

GPU

	AMD Radeon(TM) Graphics

	Versão do driver:	31.0.21914.59
	Data do driver:	31/05/2024
	Versão do DirectX:	12 (FL 12.1)
	Local físico:	Barramento PCI 8, dispositivo 0, função 0

	Utilização	0%
	Memória da GPU dedicada	32/512 MB
	Memória da GPU compartilhada	0,0/7,7 GB
	Memória da GPU	0,0/8,2 GB


Java

	OpenJDK 17


IDE

	IntelliJ IDEA Community Edition 2024.3 
