package Service;

import Model.UserProfile;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;


public class UsersDAO {
    private Session session;

    public UsersDAO(Session session){
        this.session = session;
    }

    public UserProfile get(String login) throws HibernateException{
        Criteria criteria = session.createCriteria(UserProfile.class);
        return (UserProfile) criteria.add(Restrictions.eq("login", login)).uniqueResult();
    }

    public void insertUser(UserProfile user) throws HibernateException {
        session.save(user);
    }
}

