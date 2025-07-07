/// A arquitetura de objetos distribuidos é muito importante no uso de componentes EJB em servidores de aplicação como Glassfish
/// EJB sao componentes da plataformas JEE, fornece modelo de programação robusto e escalavel
/// Separação de responsabilidades
/// OBJETOS DISTRIBUIDOS sao objetos que podem ser acessados por varios computadores em uma rede, diferentes partes de uma
/// aplicação fiquem alocados em outras maquinas
/// A comunicação entre esses objetos é feita através de chamadas remotas, permitindo que métodos sejam invocados em objetos
/// que estão em diferentes locais da rede.
/// Escalabilidade horizontal
/// Alta disponibilidade
/// Intolerancia a falhas
/// Ambiente com redundancias
/// Alta disponibilidade
/// Eficiencia na distribuição na estrutura de hardware


/// Esses serviços sao oferecidos pelo pool de EJBs por meio da interface local EJBLocalObject ou remota EJBObject
/// geradas a partir de componentes de fabrica, criados com EJBLocalHome ou EJBHome

//------ PASSO A PASSO

// Acesso a frabrica de interfaces
// Geração da interface de acesso pela fabrica
// Entrega da interface ao cliente, permitindo iniciar o dialogo com o pool

//O acesso ao banco de dados é realizado por  meio de um pool de conexões JDBC representado por um obj tipo DataSource
// Registrado via JNDI

//Acesso ao bd atravez da pool de conexoes JDBC

protected void processRequest(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            out.println("< html >< body >");
            try {
                InitialContext ctx = new InitialContext();
                DataSource dts = (DataSource) ctx.lookup("jdbc/loja");
                Connection c1 = dts.getConnection();
                Statement st = c1.createStatement();
                ResultSet rs = st.executeQuery("SELECT * FROM PRODUTO");
                while(rs.next())
                    out.println(rs.getString("NOME")+"
                            ");
                c1.close();     //liberação da conexao para a proxima requisição
            } catch (SQLException | NamingException ex) {
            }
            out.println("");
        }
} 
