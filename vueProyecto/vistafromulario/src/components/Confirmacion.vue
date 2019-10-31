<template>
  <div class="hello">
  <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">


    <Header />
    <h1>{{ mensajeFormulario }}</h1>
    <br>
    <br>
    <div>
    <img align="right" alt="imagen vacia" src="../assets/imagenVacia.jpg">
    <br><br>
    <form align="left" action="/action_page.php">
      Nombre del hotel:
      <input type="text" readonly="readonly" name="nombre-hotel" value="Hotel Riu">
      <br><br>
      Tipo de habitación:
      <input type="text" readonly="readonly" value="Familiar" name="tipo-habitacion">
      <br><br>
      Fecha de check-in:
      <input type="text" readonly="readonly" value="10-10-19" name="fecha-in"/>
      <br><br>
      Fecha de check-out:
      <input type="text" readonly="readonly" value="13-10-19" name="fecha-out"/>
      <br><br>
      Monto Final:
      <input type="text" name="monto-final" readonly="readonly" value="90.000">
      <br><br><br><br>

      <div class="type-1">
          <a href="" class="btn btn-3">
            <span class="txt">Confirmar</span>
            <span class="round"><i class="fa fa-chevron-right"></i></span>
          </a>
        </div>

    </form>
    </div>




    <br><br><br><br><br><br><br><br><br><br><br><br><br>
    <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';
export default {
  name: 'FormularioHotel',
  components: {
        Header,
        Footer
  },
  props: {
    mensajeFormulario: String
  }
}
</script>

<!-- Add "scoped" attribute to limit CSS to this component only -->
<style scoped>
h3 {
  margin: 40px 0 0;
}
ul {
  list-style-type: none;
  padding: 0;
}
li {
  display: inline-block;
  margin: 0 10px;
}
a {
  color: #42b983;
}




.btn-3 {
  background-color: #5A5B5E;
}
.btn-3 .round {
  background-color: #737478;
}

a {
  text-decoration: none;
  -moz-border-radius: 30px;
  -webkit-border-radius: 30px;
  border-radius: 30px;
  padding: 12px 53px 12px 23px;
  color: #fff;
  text-transform: uppercase;
  font-family: sans-serif;
  font-weight: bold;
  position: relative;
  -moz-transition: all 0.3s;
  -o-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
  display: inline-block;
}
a span {
  position: relative;
  z-index: 3;
}
a .round {
  -moz-border-radius: 50%;
  -webkit-border-radius: 50%;
  border-radius: 50%;
  width: 38px;
  height: 38px;
  position: absolute;
  right: 3px;
  top: 3px;
  -moz-transition: all 0.3s ease-out;
  -o-transition: all 0.3s ease-out;
  -webkit-transition: all 0.3s ease-out;
  transition: all 0.3s ease-out;
  z-index: 2;
}
a .round i {
  position: absolute;
  top: 50%;
  margin-top: -6px;
  left: 50%;
  margin-left: -4px;
  -moz-transition: all 0.3s;
  -o-transition: all 0.3s;
  -webkit-transition: all 0.3s;
  transition: all 0.3s;
}

.txt {
  font-size: 14px;
  line-height: 1.45;
}

.type-1 a:hover {
  padding-left: 48px;
  padding-right: 28px;
}
.type-1 a:hover .round {
  width: calc(100% - 6px);
  -moz-border-radius: 30px;
  -webkit-border-radius: 30px;
  border-radius: 30px;
}
.type-1 a:hover .round i {
  left: 12%;
}


.type-3 .round {
  background: transparent;
}
.type-3 a {
  position: relative;
  overflow: hidden;
}
.type-3 a.btn-1:after {
  background-color: #f59965;
}
.type-3 a.btn-2:after {
  background-color: #00c4eb;
}
.type-3 a.btn-3:after {
  background-color: #737478;
}
.type-3 a:after {
  content: "";
  -moz-border-radius: 50%;
  -webkit-border-radius: 50%;
  border-radius: 50%;
  width: 37px;
  height: 38px;
  position: absolute;
  right: 3px;
  top: 3px;
  -moz-transition: all 0.3s ease-out;
  -o-transition: all 0.3s ease-out;
  -webkit-transition: all 0.3s ease-out;
  transition: all 0.3s ease-out;
}
.type-3 a:hover:after {
  right: 100%;
  width: 50%;
}
.type-3 a:hover i {
  margin-left: 4px;
}

</style>
