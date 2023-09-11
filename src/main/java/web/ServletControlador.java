
package web;

import datos.ProductoDaoJDBC;
import dominio.Producto;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletControlador")
public class ServletControlador extends HttpServlet {
    
     @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
    
          String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "editar":
                    this.EditarCliente(request,response);
                    break;
                case "eliminar":
                    this.eliminarCliente(request, response);
                    break;
                default:
                    this.AccionDefault(request, response);

            }

        } else {
            this.AccionDefault(request, response);
        }
    }

    
     @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
    
    
    String accion = request.getParameter("accion");

        if (accion != null) {
            switch (accion) {
                case "insertar":
                    this.InsertarCliente(request, response);
                    break;

                case "modificar":
                    this.modificarProducto(request, response);
                    break;
                default:
                    this.AccionDefault(request, response);

            }

        } else {
            this.AccionDefault(request, response);
        }
    }     
    
    protected void AccionDefault(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        List<Producto> productos = new ProductoDaoJDBC().listar();
        System.out.println("productos = " + productos);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("productos", productos);
        sesion.setAttribute("saldoTotal", this.ObtenerCantidad(productos));
        request.getRequestDispatcher("productos.jsp").forward(request, response);

    }
    

      private int ObtenerCantidad(List<Producto> productos){
         int cantidadTotal = 0; 
         
         for(Producto producto:productos){
             
         cantidadTotal+=producto.getCantidad();
         }
         return cantidadTotal;
      }
      
      protected void InsertarCliente(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
          
             //Traemos a traves de getParameter todos los parametros cargados en el formulario
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String cantidadString = request.getParameter("cantidad");
        String precioString = request.getParameter("precio");
       
         int cantidad = Integer.parseInt(cantidadString);
         double precio = Double.parseDouble(precioString);
         
    
        
          //Creamos la variable cliente de tipo Cliente con sus metodos
        Producto producto = new Producto(nombre, descripcion, cantidad, precio);
        //Creamos variable registrosModifados de tipo ClienteDao donde inserte el cliente creado
        int registrosModificados =new ProductoDaoJDBC().insertar(producto);
        
        //Por ultimo actualizamos
        this.AccionDefault(request, response);
        
        
        
        
      
        
      }
     private void EditarCliente(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
    
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        Producto producto = new ProductoDaoJDBC().encontrar(new Producto(idProducto));
        request.setAttribute("producto", producto);
        String jspEdit = "/WEB-INF/paginas/producto/editarProductos.jsp";
        request.getRequestDispatcher(jspEdit).forward(request, response);
    }
   
   private void modificarProducto(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
    
       //Traemos a traves de getParameter todos los parametros cargados en el formulario
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        String nombre = request.getParameter("nombre");
        String descripcion = request.getParameter("descripcion");
        String cantidadString = request.getParameter("cantidad");
        String precioString = request.getParameter("precio");
       
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));
       
         double precio = Double.parseDouble(request.getParameter("precio"));
         
    
        
          //Creamos la variable cliente de tipo Cliente con sus metodos
        Producto producto = new Producto(idProducto,nombre, descripcion, cantidad, precio);
        //Creamos variable registrosModifados de tipo ClienteDao donde inserte el cliente creado
        int registrosModificados =new ProductoDaoJDBC().actualizar(producto);
        System.out.println("registrosModificados = " + registrosModificados);
        //Por ultimo actualizamos
        this.AccionDefault(request, response);
        
    }
    protected void eliminarCliente(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException{
        
        //Traemos a traves de getParameter todos los parametros cargados en el formulario
        int idProducto = Integer.parseInt(request.getParameter("idProducto"));
        
        //Creamos la variable cliente de tipo Cliente con sus metodos
        Producto producto = new Producto(idProducto);
        
       //Eliminamos

        int registrosModificados = new ProductoDaoJDBC().eliminar(producto);
        System.out.println("registrosModificados = " + registrosModificados);
        //Por ultimo actualizamos
        this.AccionDefault(request, response);
        
    }
    }
    
      
       

  
