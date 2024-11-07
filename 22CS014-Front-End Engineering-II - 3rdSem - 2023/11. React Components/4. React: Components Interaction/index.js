class Child extends React.Component {
    render() {
      return <h2>I am the Child Component</h2>;
    }
  }
  
  class Parent extends React.Component {
    render() {
      return (
        <div>
          <h1>I am the Parent Component</h1>
          <Child />
        </div>
      );
    }
  }
  
  // The ReactDOM.render() method should not be called here as per the instructions.