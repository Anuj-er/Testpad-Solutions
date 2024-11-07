class Display extends React.Component {
    render() {
      return (
        <Result age={this.props.age} />
      );
    }
  }
  
  class Result extends React.Component {
    render() {
      const { age } = this.props;
      return (
        <p>
          {
            age >= 18 
              ? "Yay! You're eligible." 
              : `You have to wait for ${18 - age} more years to be eligible.`
          }
        </p>
      );
    }
  }