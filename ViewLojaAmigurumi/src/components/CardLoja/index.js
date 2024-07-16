import gridCss from '../../utils/Grid'
import { Card } from 'primereact/card'

const CardLoja = (props) => {
    function colClassCss() {
        let classCss = gridCss(props.cols ? props.cols : '12')
        return classCss
    }    

    return (
        <div className={colClassCss()}>
            <Card className={props.cardHeaderClassNames}>
                <div className='p-grid'>
                    {props.children}
                </div>
            </Card>
        </div>
    )
}

export default CardLoja;