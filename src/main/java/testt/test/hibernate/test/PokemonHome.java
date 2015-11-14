package testt.test.hibernate.test;// default package
// Generated 2015-11-14 22:24:57 by Hibernate Tools 4.3.1.Final

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Home object for domain model class Pokemon.
 * @see .Pokemon
 * @author Hibernate Tools
 */
@Stateless
public class PokemonHome {

	private static final Log log = LogFactory.getLog(PokemonHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Pokemon transientInstance) {
		log.debug("persisting Pokemon instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Pokemon persistentInstance) {
		log.debug("removing Pokemon instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Pokemon merge(Pokemon detachedInstance) {
		log.debug("merging Pokemon instance");
		try {
			Pokemon result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pokemon findById(int id) {
		log.debug("getting Pokemon instance with id: " + id);
		try {
			Pokemon instance = entityManager.find(Pokemon.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
