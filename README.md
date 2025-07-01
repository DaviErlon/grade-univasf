# grade-univasf

Este é um projeto Java com o framework javaFX de uma interface gráfica 
que facilita a visualização da grade dos cursos da UNIVASF campus salgueiro.

## 📁 Estrutura

- `src/`: código-fonte e recursos como imagens e arquivos fxml.
- `jar/grade.jar`: arquivo JAR executável, é modularizado e possue dependencias JavaFX (não executa com a JRE sozinha).
- `runtime-grade/`: runtime Java personalizada criada com JLink para executar grade.jar sozinho.
- `builder/installer`: instalador para windows (único arquivo necessário para baixar o aplicativo).

## ▶️ Como executar

```bash
.\runtime-grade\bin\java.exe -jar jar/grade.jar
```
ou executar o apenas o instalador e abrir o aplicativo.

## Notas:
JavaFX não é um recurso nativo da JRE, é um framework que é reduzido para o sistema operacional, ou seja, essa aplicação
é executável apenas no windows, pois o programa depende dos arquivos não-java do JavaFX específicos para cada sistema
(arquivos .dll no windows, .so em linux, etc). Caso deseje transpor para outro sistema operacional, o prejeto precisa
usar o JavaFX correpondente ao sistema e, para ser distribuído para máquinas com o mesmo sistema e sem JavaFX e sem JRE,
precisa-se também de uma runtime personalizada usando os modulos dessa outra versão JavaFX.
