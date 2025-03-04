package com.samanecorp.secureapp.config;

import java.util.Map;
import java.util.Properties;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.AvailableSettings;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.samanecorp.secureapp.entities.UserEntity;

public class HibernateUtil {
   private static SessionFactory sessionFactory;
   private static Logger LOG = LoggerFactory.getLogger(HibernateUtil.class);
   private HibernateUtil() {
       
   }
   
   public static SessionFactory getSessionFactory() {
       if (sessionFactory == null) {
           try {
               PropertiesReader reader = new PropertiesReader("database.properties");
                               
               Configuration configuration = new Configuration();

               Properties settings = new Properties();
               settings.put(AvailableSettings.DRIVER, "com.mysql.cj.jdbc.Driver");

               settings.put(AvailableSettings.URL, "jdbc:mysql://localhost:3306/securedb?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC");
               settings.put(AvailableSettings.USER, reader.getProperty("db.username"));
               settings.put(AvailableSettings.PASS, reader.getProperty("db.password"));               
               settings.put(AvailableSettings.DIALECT, "org.hibernate.dialect.MySQL8Dialect");
               //cette ligne est très importante
               settings.put(AvailableSettings.HBM2DDL_AUTO, "create");
               
               settings.put(AvailableSettings.SHOW_SQL, "true");
               settings.put(AvailableSettings.FORMAT_SQL, "true");

               settings.put(AvailableSettings.CURRENT_SESSION_CONTEXT_CLASS, "thread");

               configuration.setProperties(settings);
               configuration.addAnnotatedClass(UserEntity.class);

               ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                       .applySettings(configuration.getProperties()).build();
               sessionFactory = configuration.buildSessionFactory(serviceRegistry);
               
               return sessionFactory;

           } catch (Exception e) {
               e.printStackTrace();
           }
       }
       return sessionFactory;
   }
}
