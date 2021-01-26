public class TesteConexao {


    public static void main(String[] args) {

        try(Conexao conexao = new Conexao() ){
            conexao.leDados();
        } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexão");
        }


//          Maneira antiga e mais verbosa:
//-----------------------------------------------------------
//    Conexao con = null;
//    try{
//    con = new Conexao();
//    con.leDados();
//    con.close();
//        } catch(IllegalStateException ex){
//            System.out.println("Deu erro na conexão");
//        } finally {
//            con.close();
//        }

    }
}