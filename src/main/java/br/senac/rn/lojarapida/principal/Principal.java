package br.senac.rn.lojarapida.principal;

//import br.sanac.rn.model.Sexo;

import br.senac.rn.lojarapida.dao.SexoDAO;
import br.senac.rn.lojarapida.model.Sexo;

//import br.sanac.rn.model.Categoria;
//import br.senac.rn.model.Cliente;
//import br.senac.rn.model.Produto;
//import br.senac.rn.model.Sexo;
//import br.senac.rn.model.Venda;
//import br.senac.rn.dao.ClienteDAO;
//import br.senac.rn.dao.ProdutoDAO;
//import br.senac.rn.dao.SexoDAO;
//import br.senac.rn.dao.VendaDAO;
//import java.util.ArrayList;
//import java.util.Calendar;
//import java.util.List;

//import br.senac.rn.dao.SexoDAO;
public class Principal {

    public static void main(String[] args) {
    
       SexoDAO dao = new SexoDAO();
       Sexo sexo = dao.selectById(5);
       sexo.setNome("MODIFICADO");
       sexo.setSigla('X');
       dao.update(sexo);
       
        System.exit(0);    
        
        
    }
}
//   // PARA LISTAR POR CPF. 2 MODOS.
//   // INICIO MODO 1
////        ClienteDAO c1 = new ClienteDAO();
////        // System.out.println(new ClienteDAO.buscaPorCpf("543.816.521-41"));
////         System.out.println(c1.buscaPorCpf("913.576.461-19"));
////    FIM MODO 1
////    MODO 2
//        System.out.println(new ClienteDAO().buscaPorCpf("816"));  // sout
//    }
////    FIM MODO 2    


//    PARA INSERIR O DADOS.
//    public static void main(String[] args) {
//        CategoriaDAO dao = new CategoriaDAO();
//        dao.inserir(new Categoria(0, "Calçado", "Só para os pes"));
// TERMINA AQUI (TEM O FINAL MESMO L�? EM BAIXO.        
//   INSERIR PEGANDO ID DE OUTRA TABELA.
//    public static void main(String[] args) {
//        
//       Produto p1 = new Produto();
//       p1.setNome("Sapato");
//       p1.setDescricao("Sem cadarço");
//       p1.setPreco(125.4f);
//       p1.setCategoria(new CategoriaDAO().buscarPorId(2));
//       
//       ProdutoDAO dao = new ProdutoDAO();
//       dao.inserir(p1);
//    //   INSERIR PEGANDO ID DE OUTRA TABELA.
//    public static void main(String[] args) {
//        
//       Cliente cli = new Cliente();
//       cli.setNome("José");
//       cli.setCpf("598.258.312-95");
//       cli.setSexo(new SexoDAO().buscarPorId(1));
//       
//       ClienteDAO dao = new ClienteDAO();
//       dao.inserir(cli);
// dao.buscarTodos().forEach((cli) -> {System.out.println(cli);});
//    SexoDAO dao = new SexoDAO();
//System.out.println(dao.buscarTodos().toString());
//        for (Sexo s : dao.buscarTodos()){
//            System.out.println(s);
//        }
// MESMA COISA DO DE CIMA.
//dao.buscarTodos().forEach((s) -> {System.out.println(s);});
// System.out.println(dao.buscarPorId(2).toString());
//dao.excluir(dao.buscarPorId(3));
//  Sexo sa = new Sexo(2,"Indefinido",'I');
//   dao.atualizar(sa);

/* PARA EXIBIR TODOS OS DADOS 
 public static void main(String[] args) {
    
          Cliente c1 = new Cliente();
          ClienteDAO dao = new ClienteDAO();
          System.out.println(dao.buscarTodos().toString());
 */

/*
   // INSERINDO COM LISTA.
       Venda venda = new Venda();
       
       venda.setCliente(new ClienteDAO().buscarPorId(1));
       venda.setData(Calendar.getInstance());
       
       List<Produto> produtos = new ArrayList();
       produtos.add(new ProdutoDAO().buscarPorId(2));
       produtos.add(new ProdutoDAO().buscarPorId(4));
       produtos.add(new ProdutoDAO().buscarPorId(2));
       produtos.add(new ProdutoDAO().buscarPorId(10));
       
       venda.setProduto(produtos);
       
       float valor = 0;
       for (Produto p : produtos){
           valor += p.getPreco();
       }
       
       venda.setValor(valor);
       
       new VendaDAO().inserir(venda);
*/

/*      USANDO O GenericDAO para inserir
    public static void main(String[] args) {
       
        new SexoDAO().insert(new Sexo(0, "Transexual", 'T'));
        System.exit(0);
        
    }

*/
/*
 ----- LISTAR TODOS
 System.out.println(new SexoDAO().selectALL()));
        System.exit(0);
    ------------
    ESCOLHENDO UM
System.out.println(new SexoDAO().selectById(1));
        System.exit(0);
*/

/*       ALTERAR 
       SexoDAO dao = new SexoDAO();
       Sexo sexo = dao.selectById(5);
       sexo.setNome("TROCADO");
       sexo.setSigla('X');
       dao.update(sexo);
*/