package web.dao;

import org.springframework.stereotype.Repository;
import web.model.User;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {
    @PersistenceContext
    private EntityManager em;


    @Override
    public void addUser(User user) {
        em.persist(user);
    }

    @Override
    public void updUser(User user) {
        em.merge(user);
    }

    @Override
    public void delUser(int id) {
        User user = em.find(User.class, id);
        em.remove(user);
    }

    @Override
    public List<User> listUsers() {
        return em.createQuery("FROM User", User.class).getResultList();
    }

    @Override
    public User findUser(int id) {
        return em.createQuery("from User u where u.id =: id", User.class)
                .setParameter("id", id).getSingleResult();
    }

}
