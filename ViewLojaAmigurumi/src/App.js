import React from "react";
import { BrowserRouter as Router, Route, Switch } from "react-router-dom";
import Homepage from "./components/HomePage";
import { Teste } from 'primereact/button';

const App = () => {
    <Router>
        <div className="p-col-12">
            <Teste className="p-col-3" label="Home Page" onClick={() => window.location.pathname = '/'} />
            <Switch>
                <Route exact path="/" Component={Homepage}/>
            </Switch>
        </div>
    </Router>
}

export default App;