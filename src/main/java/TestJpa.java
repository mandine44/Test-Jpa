
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

//import dev.entites.Pizza;

public class TestJpa {

	public static void main(String[] args) {
		EntityManagerFactory emf = null;

		// try {
		emf = Persistence.createEntityManagerFactory("pu_essai");

		EntityManager em = emf.createEntityManager();

		/*
		 * Pizza pizzaId1 = em.find(Pizza.class, 1);
		 * System.out.println("Pizza id=1 name=" + pizzaId1.getName());
		 * 
		 * TypedQuery<Pizza> query = em.createQuery("select p from Pizza p",
		 * Pizza.class);
		 * 
		 * List<Pizza> listePizzas = query.getResultList();
		 * 
		 * for (Pizza pizza : listePizzas) { System.out.println(pizza.getName()); }
		 * 
		 * 
		 * em.close();
		 * 
		 * System.out.println("Pizza id=1 name=" + pizzaId1.getName()); } catch
		 * (PersistenceException e) { System.err.println("Erreur de persistance : " +
		 * e.getMessage()); }
		 * 
		 * finally { if (emf != null) { emf.close(); } }
		 */

	}
}
