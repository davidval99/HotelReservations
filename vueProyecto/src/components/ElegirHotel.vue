<template>
  <div class="hello">

    <link href="//maxcdn.bootstrapcdn.com/font-awesome/4.1.0/css/font-awesome.min.css" rel="stylesheet">


    <Header />
    <h1>{{ mensajeElegir }}</h1>
    <div name ="infoHotel">

    </div>

    <table width="50%" align="center" border="0">
      <tr>
             <td><h2 align="left">Nombre del hotel</h2></td>
             <td><h2 align="center">Región</h2></td>
             <td><h2 align="right">Puntuación</h2></td>
      </tr>
    </table>

    <div style="margin-right:360px">
    <table width=10% align="right" border="0">
        <tr>
            <td><img alt="estrella" src="../assets/estrellaLlena.jpg"></td>
            <td><img alt="estrella" src="../assets/estrellaLlena.jpg"></td>
            <td><img alt="estrella" src="../assets/estrellaLlena.jpg"></td>
            <td><img alt="estrella" src="../assets/estrellaLlena.jpg"></td>
            <td><img alt="estrella" src="../assets/estrellaNoLlena.png"></td>
        </tr>
    </table>
    </div>
    <br>
    <br>
    <br>
    <img alt="imagen vacia" src="../assets/imagenVacia.jpg">
    <br><br>

    <table width="50%" align="center" border="0">
          <tr>
                 <td><h2 align="left">Like</h2></td>
                 <td><h2 align="left">  Dislike</h2></td>
                 <td><div class="dropdown dropdown-dark">
                         <select name="two" class="dropdown-select">
                           <option value="">Select…</option>
                           <option value="1">Option #1</option>
                           <option value="2">Option #2</option>
                           <option value="3">Option #3</option>
                         </select>
                      </div></td>
                 <td>
                     <div class="type-1">
                               <a href="" class="btn btn-3">
                                 <span class="txt">Solicitar Reserva</span>
                                 <span class="round"><i class="fa fa-chevron-right"></i></span>
                               </a>
                     </div>
                 </td>
          </tr>
    </table>
    <div align="left" style="margin-left:200px">
    <input type="text" name="titulo" value="Titulo"><br><br>
    <textarea rows="4" cols="50"></textarea>
    </div>
    <br><br><br><br>
    <Footer />
  </div>
</template>

<script>
import Header from './Header/Header';
import Footer from './Footer/Footer';
export default {
  name: 'HelloWorld',
  components: {
        Header,
        Footer
  },
  props: {
    mensajeElegir: String
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







.dropdown {
  display: inline-block;
  position: relative;
  overflow: hidden;
  height: 28px;
  width: 150px;
  background: #f2f2f2;
  border: 1px solid;
  border-color: white #f7f7f7 whitesmoke;
  border-radius: 3px;
  background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
  background-image: -moz-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
  background-image: -o-linear-gradient(top, transparent, rgba(0, 0, 0, 0.06));
  background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.06));
  -webkit-box-shadow: 0 1px 1px rgba(0, 0, 0, 0.08);
  box-shadow: 0 1px 1px rgba(0, 0, 0, 0.08);
}

.dropdown:before, .dropdown:after {
  content: '';
  position: absolute;
  z-index: 2;
  top: 9px;
  right: 10px;
  width: 0;
  height: 0;
  border: 4px dashed;
  border-color: #888888 transparent;
  pointer-events: none;
}

.dropdown:before {
  border-bottom-style: solid;
  border-top: none;
}

.dropdown:after {
  margin-top: 7px;
  border-top-style: solid;
  border-bottom: none;
}

.dropdown-select {
  position: relative;
  width: 130%;
  margin: 0;
  padding: 6px 8px 6px 10px;
  height: 28px;
  line-height: 14px;
  font-size: 12px;
  color: #62717a;
  text-shadow: 0 1px white;
  background: #f2f2f2; /* Fallback for IE 8 */
  background: rgba(0, 0, 0, 0) !important; /* "transparent" doesn't work with Opera */
  border: 0;
  border-radius: 0;
  -webkit-appearance: none;
}

.dropdown-select:focus {
  z-index: 3;
  width: 100%;
  color: #394349;
  outline: 2px solid #49aff2;
  outline: 2px solid -webkit-focus-ring-color;
  outline-offset: -2px;
}

.dropdown-select > option {
  margin: 3px;
  padding: 6px 8px;
  text-shadow: none;
  background: #f2f2f2;
  border-radius: 3px;
  cursor: pointer;
}

/* Fix for IE 8 putting the arrows behind the select element. */


/* Dirty fix for Firefox adding padding where it shouldn't. */

.dropdown-dark {
  background: #444;
  border-color: #111111 #0a0a0a black;
  background-image: -webkit-linear-gradient(top, transparent, rgba(0, 0, 0, 0.4));
  background-image: -moz-linear-gradient(top, transparent, rgba(0, 0, 0, 0.4));
  background-image: -o-linear-gradient(top, transparent, rgba(0, 0, 0, 0.4));
  background-image: linear-gradient(to bottom, transparent, rgba(0, 0, 0, 0.4));
  -webkit-box-shadow: inset 0 1px rgba(255, 255, 255, 0.1), 0 1px 1px rgba(0, 0, 0, 0.2);
  box-shadow: inset 0 1px rgba(255, 255, 255, 0.1), 0 1px 1px rgba(0, 0, 0, 0.2);
}

.dropdown-dark:before {
  border-bottom-color: #aaa;
}

.dropdown-dark:after {
  border-top-color: #aaa;
}

.dropdown-dark .dropdown-select {
  color: #aaa;
  text-shadow: 0 1px black;
  background: #444;  /* Fallback for IE 8 */
}

.dropdown-dark .dropdown-select:focus {
  color: #ccc;
}

.dropdown-dark .dropdown-select > option {
  background: #444;
  text-shadow: 0 1px rgba(0, 0, 0, 0.4);
}







</style>
