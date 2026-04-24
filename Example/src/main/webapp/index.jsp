<script>
  let counter = 0;
  function incrementCounter() {
    counter += 1;
    document.getElementById("counter-value").textContent = counter;

    // This sends the signal to your Java code
    fetch('/Example/increment'); 
  }
</script>