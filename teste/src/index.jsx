import * as React from "react";
import { createRoot } from 'react-dom/client';
import { BrowserRouter } from "react-router-dom";
import ScrollToTop from "./ScrollToTop";
import Home from "./components/home.jsx";

const root = createRoot(document.body);
root.render(<div>
    <BrowserRouter>
        <ScrollToTop>
            <Home />
        </ScrollToTop>
    </BrowserRouter>
</div>)