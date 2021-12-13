import './App.css';
import ResponsiveAppBar from './components/AppBar';
import ServicesDataTable from './components/Services';

function App() {
  return (
    <div className="App">
      <ResponsiveAppBar/>
      <ServicesDataTable></ServicesDataTable>
    </div>
  );
}

export default App;
