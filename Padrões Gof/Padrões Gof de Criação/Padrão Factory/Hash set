///Versao da operação remover itens invalidos com uso de Hash Set

pubic void removerItensInvalidos(HashSet < ItemPedido > itens) {
    HashSetIterator<ItemPedido> cursor = new HashSetIterator(itens);
    while (cursor.hasNext()) {
        ItemPedido item = cursor.next();
        i(! isValido(item));{
            cursor.remove(item);
        }
    }
}

///outra forma de fazer isso

public void removerItensInvalidos(Collection<ItemPedido> itens) throws Exception {
    Iterator<ItemPedido> cursor = null;
    if (itens instanceof ArrayList)
        cursor = new ArrayIterator((ArrayList) itens);
    else if (itens instanceof HashSet)
        cursor = new HashSetIterator((HashSet) itens);
    
    if (cursor == null)
    throw new Exception("tipo da coleção de itens inválido");

    while (cursor.hasNext()){
        ItemPedido item = cursor.next();
        if (! isValido(item)) {
            cursor.remove(item)
        }
    }
}