import gridCss from '../../utils/Grid'
import { Card } from 'primereact/card'

const CardLoja = (props) => {
    function colClassCss() {
        let classCss = gridCss(props.cols ? props.cols : '12')
        return classCss
    }    

    return (
        <div className="">
            <Card>
                <div>
                    
                </div>
            </Card>
        </div>
    )
}