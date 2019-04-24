package br.com.fiap.test;

import br.com.fiap.dao.MotoristaDAO;
import br.com.fiap.dao.impl.MotoristaDAOImpl;
import br.com.fiap.entity.Veiculo;
import br.com.fiap.singleton.EntityManagerFactorySingleton;

public class MotoristaDAOTest {
	
	public static void main(String[] args) {
		MotoristaDAO dao = new MotoristaDAOImpl(EntityManagerFactorySingleton.getInstance().createEntityManager());
		
		Veiculo motorista = new Veiculo("321asd", "preto", 2015);
	}

}