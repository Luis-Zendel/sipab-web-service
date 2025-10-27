package mx.com.telcel.sipab.configuration;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(
    basePackages = "mx.com.telcel.sipab.repositories",
    entityManagerFactoryRef = "oracleEntityManager",
    transactionManagerRef = "oracleTransactionManager"
)
@PropertySource("file:./conf/BBDD.properties")
public class OracleDataSourceConfiguration {
	
	@Primary
    @Bean(name = "oracleDataSourceProperties")
    @ConfigurationProperties("oracle.datasource")
    DataSourceProperties oracleDataSourceProperties() {
        return new DataSourceProperties();
    }

    @Primary
    @Bean(name = "oracleDataSource")
    @ConfigurationProperties("oracle.datasource.configuration")
    DataSource oracleDataSource(@Qualifier("oracleDataSourceProperties") DataSourceProperties oracleDataSourceProperties) {
        return oracleDataSourceProperties.initializeDataSourceBuilder().type(HikariDataSource.class).build();
    }

    @Primary
    @Bean(name = "oracleEntityManager")
    LocalContainerEntityManagerFactoryBean oracleEntityManager(
        EntityManagerFactoryBuilder builder, @Qualifier("oracleDataSource") DataSource ds) {
        return builder
            .dataSource(ds)
            .packages("mx.com.telcel.sipab.models")
            .persistenceUnit("oracle")
            .build();
    }

    @Primary
    @Bean
    PlatformTransactionManager oracleTransactionManager(
            final @Qualifier("oracleEntityManager") LocalContainerEntityManagerFactoryBean oracleEntityManager) {
        return new JpaTransactionManager(oracleEntityManager.getObject());
    }

}
