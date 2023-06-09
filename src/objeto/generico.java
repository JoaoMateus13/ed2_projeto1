package objeto;

public class generico<K, V> implements Comparable {

    private K key;
    private V value;

    public generico(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public Object getvalue() {
        if (this.value != null) {
            return (Object) value;
        } else {
            return (String) null;
        }
    }

    public <K> int compararCom(K key2) {
         return this.comparar(this.key, key2); // Ordenação em ordem crescent

        /*Mudando a ordem de comparação faz com que o valor maior tenha um resultado negativo
        * fazendo com que a ordenação coloque ele como um valor minimo key2=vetor[min]*/

       /*} else {
            return this.comparar(key2, this.key); // Ordenação em ordem decrescente (apenas inverte a ordem das chaves)
        }*/
    }


    public <K> int comparar(K key1, K key2) {
        if (key1 instanceof String) {
            return ((String) key1).compareTo((String) key2);
        } else if (key1 instanceof Integer) {
            return Integer.compare((int) key1, (int) key2);
        } else {
            return Double.compare((double) key1, (double) key2);
        }
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "generico{" +
                "key=" + key +
                ", value=" + value +
                '}';
    }
}
