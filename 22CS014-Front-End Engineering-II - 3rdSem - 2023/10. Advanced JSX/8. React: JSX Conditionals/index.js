function JSXElement(value) {
    return (
      <p>
        {value > 10 ? "Greater" : value < 10 ? "Lesser" : "Equal"}
      </p>
    );
  }