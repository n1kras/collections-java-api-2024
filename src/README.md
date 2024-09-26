# List, Set e Map #
List: pode ter elementos duplicaados
Set: nao pode conter elementos duplicados, implementa-se o equals e o hashset para definir qual atributo da classe define que é unico.
Se tentar adicionar um elemento duplicado, ele nao adiciona.
Map: usada para mapear dados na forma de chaves e valores. Nao pode conter chaves duplicadas.
utiliza o metodo put no lugar de add:
put tanto adiciona um novo quanto atualiza (sobrescreve). Neste caso, se utilizar o put para adicionar um novo elemento
identico a um anterior, ele sobrescrevera o anterior.