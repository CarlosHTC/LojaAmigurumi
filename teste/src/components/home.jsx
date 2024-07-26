import React from "react";
import { Card } from 'primereact/card'

export default function Home(props) {

    function colClasseCss() {
        // Carrega a Grid Css
        let classeCss = gridCss(props.cols ? props.cols : '12')
        // Retorna as classes CSS customizadas    
        return classeCss
    }

    function title() {
        if (props.title) {
            return (
                <div className="p-col-12">

                    { props.handleVoltar ?
                        <div className="p-grid" style={{ cursor: 'pointer', alignItems: 'center' }} onClick={props.handleVoltar}>
                            <div className="p-col-12 p-md-6 p-lg-4 p-xl-4  ">
                                <div style={{ display: 'flex' }}>
                                    <i
                                        className="pi pi-angle-left"
                                        style={{ fontSize: '2rem', margin: '1.5rem 0 1rem 0' }}
                                    />
                                    <h5 style={{ flex: 1 }}>
                                        <strong>{props.title}</strong>
                                    </h5>
                                </div>
                            </div>
                            <div className="p-col-12 p-md-6">
                                {props.legenda && props.legenda()}
                            </div>
                        </div>
                        :
                        <h5 >
                            <strong>{props.title}</strong>
                            {props.legenda && props.legenda()}
                        </h5>
                    }


                    <hr />
                </div>
            );
        } else {
            return (<></>)
        }
    }

    return (
        <div className={colClasseCss}>
            <Card className={props.cardHeaderClassNames} >
                <div className="p-grid">
                    {title()}
                    {props.children}
                </div>
            </Card>
        </div>
    )
}