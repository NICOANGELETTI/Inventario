
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<fmt:setLocale value="es_MX"/>

<!-- Tabla de Inventario-->
        <div class="container mt-5">
            <table class="table">
                <thead>
                    <tr class="table-warning">
                        <th>#</th>
                        <th>Nombre</th>
                        <th>Descripción</th>
                        <th>Precio</th>
                        <th>Cantidad</th>
                        <th></th>
                    </tr>
                </thead>
                <c:forEach var="producto" items="${productos}">
                    <tbody>

                        <tr>
                            <td>  ${producto.idProducto}</td>
                            <td> ${producto.nombre} </td>
                            <td> ${producto.descripcion}</td>
                            <td > <fmt:formatNumber value="${producto.precio}" type="currency"/></td>
                            <td>${producto.cantidad}</td>
                            <td>
                                <a href="${pageContext.request.contextPath}/ServletControlador?accion=editar&idProducto=${producto.idProducto}"
                                   class="btn btn-success">
                                    <i class="fas fa-angle-double-right"></i> Editar
                                </a>
                            </td>
                        </tr>

                        <!-- Puedes agregar más filas similares para más productos -->
                    </tbody>
                </c:forEach>
            </table>
        </div>

<jsp:include page="agregarProductos.jsp"></jsp:include>