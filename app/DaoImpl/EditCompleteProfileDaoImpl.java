package DaoImpl;

import Dao.EditCompleteProfileDao;
import DaotransactionPOJO.EditCompleteProfiledetailsPojo;
import Entity.CompleteProfileEntity;
import Entity.EditCompleteProfileEntity;
//import Entity.EditProfileEntity;
import Entity.RegistrationdetailsEntity;
import com.srujanika.utils.EncyDecyUtility;
import com.srujanika.utils.HibernateUtils;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;

import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.Callable;

public class EditCompleteProfileDaoImpl implements EditCompleteProfileDao {

    @Override
    public EditCompleteProfileEntity getcompletedetails(String profid) {
        //  EditProfileEntity editProfileEntity = new EditProfileEntity();
        CompleteProfileEntity completeProfileEntity = null;
        EditCompleteProfileEntity editCompleteProfileEntity1=null;
        String result = "";
        HibernateUtils hibernateUtils = HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        // List<EditProfileEntity> list = null;

    Criteria criteria = session.createCriteria(CompleteProfileEntity.class);

    criteria.add(Restrictions.eq("atp000", profid));
//        CompleteProfileEntity completeProfileEntity1= (CompleteProfileEntity) criteria.uniqueResult();
//        if (null!=completeProfileEntity1.getAtp000()||!completeProfileEntity1.getAtp000().isEmpty()){

    List<CompleteProfileEntity> list = criteria.list();
    if (null != list && list.size() > 0) {
        completeProfileEntity = list.get(0);

        //System.out.println(results.toString());

//        System.out.println("it is coming here");
//        Criteria criteria1 = session.createCriteria(CompleteProfileEntity.class);
//        criteria1.add(Restrictions.eq("atp000", "13"));
//        List<CompleteProfileEntity> result1 = criteria1.list();
//        //System.out.println(result1.toString());
//
//
//        completeProfileEntity = result1.get(0);
        EditCompleteProfileEntity editCompleteProfileEntity = new EditCompleteProfiledetailsPojo().setAllValues(completeProfileEntity);
        session.close();
        return editCompleteProfileEntity;
    }

        else {
        session.close();
        return null;
    }


    }



    @Override
    public void saveeditdetails(EditCompleteProfileEntity editCompleteProfileEntity,String profid) {
        HibernateUtils hibernateUtils = HibernateUtils.getInstance();
        SessionFactory sessionFactory = hibernateUtils.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

       // EditProfileEntity editProfileEntity = new EditProfileEntity();
        CompleteProfileEntity completeProfileEntity = new CompleteProfileEntity();
        Criteria criteria = session.createCriteria(CompleteProfileEntity.class);
        criteria.add(Restrictions.eq("atp000",profid));
        CompleteProfileEntity completeProfileEntity1 = (CompleteProfileEntity) criteria.uniqueResult();
        if(completeProfileEntity1!=null) {
            completeProfileEntity1.setAt007(editCompleteProfileEntity.getAt007());
            completeProfileEntity1.setAt008(editCompleteProfileEntity.getAt008());
            completeProfileEntity1.setAt009(editCompleteProfileEntity.getAt009());
            completeProfileEntity1.setAt010(editCompleteProfileEntity.getAt010());
            completeProfileEntity1.setAt011(editCompleteProfileEntity.getAt011());
            completeProfileEntity1.setAt012(editCompleteProfileEntity.getAt012());
            completeProfileEntity1.setAt013(editCompleteProfileEntity.getAt013());
            completeProfileEntity1.setAt014(editCompleteProfileEntity.getAt014());
            completeProfileEntity1.setAt015(editCompleteProfileEntity.getAt015());
            completeProfileEntity1.setAt016(editCompleteProfileEntity.getAt016());
            completeProfileEntity1.setAt017(editCompleteProfileEntity.getAt017());
            completeProfileEntity1.setAt018(editCompleteProfileEntity.getAt018());
            completeProfileEntity1.setAt019(editCompleteProfileEntity.getAt019());
            completeProfileEntity1.setAt020(editCompleteProfileEntity.getAt020());
            completeProfileEntity1.setAt021(editCompleteProfileEntity.getAt021());
            completeProfileEntity1.setAt022(editCompleteProfileEntity.getAt022());
            completeProfileEntity1.setAt023(editCompleteProfileEntity.getAt023());
            completeProfileEntity1.setAt024(editCompleteProfileEntity.getAt024());
            completeProfileEntity1.setAt025(editCompleteProfileEntity.getAt025());
            completeProfileEntity1.setAt026(editCompleteProfileEntity.getAt026());
            completeProfileEntity1.setAt027(editCompleteProfileEntity.getAt027());
            completeProfileEntity1.setAt028(editCompleteProfileEntity.getAt028());
            completeProfileEntity1.setAt029(editCompleteProfileEntity.getAt029());
            completeProfileEntity1.setAt030(editCompleteProfileEntity.getAt030());
            completeProfileEntity1.setAt031(editCompleteProfileEntity.getAt031());
            completeProfileEntity1.setAt032(editCompleteProfileEntity.getAt032());
            completeProfileEntity1.setAt035(editCompleteProfileEntity.getAt035());
            completeProfileEntity1.setAt036(editCompleteProfileEntity.getAt036());
            completeProfileEntity1.setAt037(editCompleteProfileEntity.getAt037());
            completeProfileEntity1.setAt038(editCompleteProfileEntity.getAt038());
            completeProfileEntity1.setAt039(editCompleteProfileEntity.getAt039());
            completeProfileEntity1.setAt040(editCompleteProfileEntity.getAt040());
            completeProfileEntity1.setAt041(editCompleteProfileEntity.getAt041());
            completeProfileEntity1.setAt042(editCompleteProfileEntity.getAt042());
            completeProfileEntity1.setAt043(editCompleteProfileEntity.getAt043());
            completeProfileEntity1.setAt044(editCompleteProfileEntity.getAt044());
            completeProfileEntity1.setAt045(editCompleteProfileEntity.getAt045());
            completeProfileEntity1.setAt046(EncyDecyUtility.getEncrypetedValue(editCompleteProfileEntity.getAt046(), "yourmobilenumber"));
            completeProfileEntity1.setAt047(editCompleteProfileEntity.getAt047());
            //completeProfileEntity.setAtp000("13");
            session.saveOrUpdate(completeProfileEntity1);
        }
        else
        {
            completeProfileEntity.setAtp000(profid);
            completeProfileEntity.setAt007(editCompleteProfileEntity.getAt007());
            completeProfileEntity.setAt008(editCompleteProfileEntity.getAt008());
            completeProfileEntity.setAt009(editCompleteProfileEntity.getAt009());
            completeProfileEntity.setAt010(editCompleteProfileEntity.getAt010());
            completeProfileEntity.setAt011(editCompleteProfileEntity.getAt011());
            completeProfileEntity.setAt012(editCompleteProfileEntity.getAt012());
            completeProfileEntity.setAt013(editCompleteProfileEntity.getAt013());
            completeProfileEntity.setAt014(editCompleteProfileEntity.getAt014());
            completeProfileEntity.setAt015(editCompleteProfileEntity.getAt015());
            completeProfileEntity.setAt016(editCompleteProfileEntity.getAt016());
            completeProfileEntity.setAt017(editCompleteProfileEntity.getAt017());
            completeProfileEntity.setAt018(editCompleteProfileEntity.getAt018());
            completeProfileEntity.setAt019(editCompleteProfileEntity.getAt019());
            completeProfileEntity.setAt020(editCompleteProfileEntity.getAt020());
            completeProfileEntity.setAt021(editCompleteProfileEntity.getAt021());
            completeProfileEntity.setAt022(editCompleteProfileEntity.getAt022());
            completeProfileEntity.setAt023(editCompleteProfileEntity.getAt023());
            completeProfileEntity.setAt024(editCompleteProfileEntity.getAt024());
            completeProfileEntity.setAt025(editCompleteProfileEntity.getAt025());
            completeProfileEntity.setAt026(editCompleteProfileEntity.getAt026());
            completeProfileEntity.setAt027(editCompleteProfileEntity.getAt027());
            completeProfileEntity.setAt028(editCompleteProfileEntity.getAt028());
            completeProfileEntity.setAt029(editCompleteProfileEntity.getAt029());
            completeProfileEntity.setAt030(editCompleteProfileEntity.getAt030());
            completeProfileEntity.setAt031(editCompleteProfileEntity.getAt031());
            completeProfileEntity.setAt032(editCompleteProfileEntity.getAt032());
            completeProfileEntity.setAt035(editCompleteProfileEntity.getAt035());
            completeProfileEntity.setAt036(editCompleteProfileEntity.getAt036());
            completeProfileEntity.setAt037(editCompleteProfileEntity.getAt037());
            completeProfileEntity.setAt038(editCompleteProfileEntity.getAt038());
            completeProfileEntity.setAt039(editCompleteProfileEntity.getAt039());
            completeProfileEntity.setAt040(editCompleteProfileEntity.getAt040());
            completeProfileEntity.setAt041(editCompleteProfileEntity.getAt041());
            completeProfileEntity.setAt042(editCompleteProfileEntity.getAt042());
            completeProfileEntity.setAt043(editCompleteProfileEntity.getAt043());
            completeProfileEntity.setAt044(editCompleteProfileEntity.getAt044());
            completeProfileEntity.setAt045(editCompleteProfileEntity.getAt045());
            completeProfileEntity.setAt046(EncyDecyUtility.getEncrypetedValue(editCompleteProfileEntity.getAt046(), "yourmobilenumber"));
            completeProfileEntity.setAt047(editCompleteProfileEntity.getAt047());
            session.save(completeProfileEntity);
        }
//        completeProfileEntity=(CompleteProfileEntity)criteria1.uniqueResult();
//        //System.out.println("haiiiiiii"+completeProfileEntity);
                //  session.saveOrUpdate(completeProfileEntity);
                transaction.commit();
                session.close();

            }


}
