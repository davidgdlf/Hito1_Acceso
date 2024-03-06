    package es.dataanalyzer.config;

    import org.springframework.context.annotation.Bean;
    import org.springframework.context.annotation.Configuration;
    import org.springframework.jdbc.datasource.DriverManagerDataSource;
    import javax.sql.DataSource;
    import org.hibernate.dialect.PostgreSQLDialect; // Importar el dialecto de PostgreSQL

    @Configuration
    public class DatabaseConfig {

        @Bean
        public DataSource dataSource() {
            DriverManagerDataSource dataSource = new DriverManagerDataSource();
            dataSource.setDriverClassName("org.postgresql.Driver");
            dataSource.setUrl("jdbc:postgresql://localhost:5432/hito");
            dataSource.setUsername("tecnico");
            dataSource.setPassword("contraseña");
            return dataSource;
        }

        // Configurar el dialecto de Hibernate
        @Bean
        public PostgreSQLDialect hibernateDialect() {
            return new PostgreSQLDialect();
        }
    }
