public void removerItensInvalidos(Collection<ItemPedido> itens) {
    Iterator<ItemPedido> iterator = itens.iterator();
    while(iterator.hasNext()) {
        ItemPedido item = iterator.next();
        if (! isValido(item)){
            itens.remove(item);
        }   
    }
}

/// framework collection