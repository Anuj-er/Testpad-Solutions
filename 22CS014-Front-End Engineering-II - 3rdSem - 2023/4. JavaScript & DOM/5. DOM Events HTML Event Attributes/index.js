function changeBackgroundToRed() {
    const div = document.getElementById('my-div');
    div.style.backgroundColor = 'red';
  }
  
  // Attaching the function to the onclick attribute
  document.getElementById('my-div').onclick = changeBackgroundToRed;