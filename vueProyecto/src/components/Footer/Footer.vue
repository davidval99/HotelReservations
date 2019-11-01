<template>
  <footer class="footer">
      <h1>Posted by: B & B Hotels</h1>
      <h1>Contact information: <a href="mailto:someone@example.com">
      someone@example.com</a>.</h1>
  </footer>
</template>

<script>
    export default {
        name: "Footer"
    };
</script>

<style scoped>
    .footer{
        background: #333;
        color: #fff;
        text-align: center;
        padding: 10px;
    }

    .footer a{
        color: #fff;
        padding-right: 5px;
    }
</style>