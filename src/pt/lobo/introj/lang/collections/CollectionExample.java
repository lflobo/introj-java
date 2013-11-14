package pt.lobo.introj.lang.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.google.common.collect.Sets.SetView;

public class CollectionExample {
	
	public static void main(String[] args) {
		// Exemplo de criacao de uma collection
		Collection<String> strings = new ArrayList<String>();
		strings.add("one string");
		strings.add("two string");
		
		// O mesmo mas especificando como uma lista
		List<String> stringList = new ArrayList<String>();
		stringList.add("bla");
		stringList.add("bla"); // fica repetido
		
		/**
		 * Operações com List's
		 */
		// Adicionar todos os elements de 'strings'
		stringList.addAll(strings);
		
		// Remove um elemento
		stringList.remove("one string");
		
		// Ordenar uma lista
		Collections.sort(stringList);
		
		// Ordenar com controlo sobre a comparação
		Collections.sort(stringList, new Comparator<String>() {
			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		
		// Iterar sobre a lista
		for(String s : stringList) {
			// faz cenas com s
		}
		
		// Iterar com prespectivas de alterar a lista
		Iterator<String> it = strings.iterator();
		while (it.hasNext()) {
			// remover o item
			it.remove();
		}
		
		/**
		 * Sets não adicionam elementos repetidos.
		 * Ordem dos elementos é arbitraria
		 */
		Set<Integer> ints = new HashSet<Integer>();
		ints.add(1);
		ints.add(2);
		ints.add(1); // retorna 'false' e não adiciona
		
		/**
		 * O mesmo que em cima, mas mantendo a ordem de inserção
		 */
		SortedSet<Integer> sortedInts = new TreeSet<Integer>();
		sortedInts.add(1);
		sortedInts.add(2);
		
		/**
		 * Sets suportam pouco mais que as operações básicas: add, remove, ...
		 */
		// Verificar se um elemento está no Set
		boolean exists = ints.contains(1);
		
		/**
		 * Biblioteca Guava (da Google) ajuda em algumas operações comuns com
		 * collections.
		 */
		// Cria uma 'view' read-only da intersection ds 2 sets
		SetView<Integer> intersection = Sets.intersection(ints, sortedInts);
		
		// Criar lista com base num conjunto de elementos
		List<String> fastList = Lists.newArrayList("a", "b", "c");
		
		/**
		 * Mapas
		 */
		// Criar um mapa usando o Guava
		Map<String, Integer> counts = Maps.newHashMap();
		counts.put("batatas", 1);
		counts.put("arroz", 1);
		
		// Iterar sobre um mapa
		for(String key : counts.keySet()) {
			int count = counts.get(key);
			// faz cenas com count
		}
		
	}

}
