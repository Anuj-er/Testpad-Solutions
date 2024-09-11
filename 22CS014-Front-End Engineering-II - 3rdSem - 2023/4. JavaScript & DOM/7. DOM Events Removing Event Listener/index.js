function removeOnMouseLeave() {
    const div = document.getElementById('my-div');
    div.removeEventListener('mouseleave', changeWhite);
  }