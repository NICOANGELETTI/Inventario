<!-- Buscador de producto-->
<div class="container mt-5">
    <div class="row">
        <div class="col-md-6 offset-md-3">
      
            <!--Busqueda de producto-->
            <!-- 
            <form class="d-flex">
                <input class="form-control me-2" type="search" placeholder="Busca aquí tu producto" aria-label="Search">
                <button class="btn btn-success" type="submit">Buscar</button>
            </form>
            -->
        </div>
    </div>
</div>
<br>

<!--Total de Inventario-->
<div class="col-md-3 mx-auto">
    <div class="card"  style="background-color: #E6F7FF; border-color: #007BFF;">
        <div class="card-body">
            <h5 class="card-title">Inventario Total</h5>
            <p class="card-text">Cantidad total: ${saldoTotal}</p> 
        </div>
    </div>
</div>
<br>

<!--Modal Agregar-->
    <div class="container">
        <div class="row">
            <div class="col-md-3">
                <a href="#" class="btn btn-primary btn-success"
                   data-toggle="modal" data-target="#agregarProductoModal">
                    <i class="fas fa-plus"></i> Agregar Producto
                </a>
            </div>
        </div>
    </div>
