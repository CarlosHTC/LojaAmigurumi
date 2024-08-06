import * as React from "react";
import { createRoot } from 'react-dom/client';
import { BrowserRouter } from "react-router-dom";
import Home from "./components/home.jsx";

const root = createRoot(document.body);
root.render(<div>
    <BrowserRouter>
            <Home />
    </BrowserRouter>
</div>)