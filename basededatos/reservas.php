<?php

// Verificar si se reciben los datos del formulario
if ($_SERVER["REQUEST_METHOD"] == "GET") {
    // Establecer conexión a la base de datos (ajusta los parámetros según tu configuración)
    $servername = "ricondeoliva.crig4y0kwxey.us-east-1.rds.amazonaws.com";
    $username = "alejandro";
    $password = "B15a2r3B**+2001";
    $dbname = "rincondeoliva";

    $conn = new mysqli($servername, $username, $password, $dbname);

    // Verificar la conexión
    if ($conn->connect_error) {
        die("La conexión a la base de datos falló: " . $conn->connect_error);
    }

    // Obtener valores del formulario
    $nombre = $_GET["Nombre"];
    $apellido = $_GET["Apellido"];
    $correoelectronico = $_GET["CorreoElectronico"];
    $telefono = $_GET["Telefono"];
    $personas = $_GET["Personas"];
    $hora = $_GET["hora"];
    $fecha = $_GET["fecha"];

    // Preparar la consulta SQL para la inserción
    $sql = "INSERT INTO reservas ( Nombre, Apellido, CorreoElectronico, Telefono, Personas, hora , fecha)
            VALUES ( '$nombre', '$apellido', '$correoelectronico', '$telefono', '$personas', '$hora','$fecha')";

    // Ejecutar la consulta
    if ($conn->query($sql) === TRUE) {
        echo "Registro insertado correctamente";
    } else {
        echo "Error al insertar el registro: " . $conn->error;
    }

    // Cerrar la conexión a la base de datos
    $conn->close();
}
?>